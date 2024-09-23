document.addEventListener("DOMContentLoaded", function() {
    let roomPrice = 0; // Declare roomPrice variable

    // Get all 'Book Now' buttons
    const bookNowButtons = document.querySelectorAll('.book-now-btn');

    bookNowButtons.forEach(button => {
        button.addEventListener('click', function(event) {
            event.preventDefault();

            // Get room details from the button's data attributes
            const roomName = this.getAttribute('data-room-name');
            const roomType = this.getAttribute('data-room-type');
            roomPrice = parseFloat(this.getAttribute('data-price')); // Set roomPrice from data attribute
            const User_Name = this.getAttribute('data-user-name');
            const User_Phone = this.getAttribute('data-user-phone');
            const User_Email = this.getAttribute('data-user-email');

            // Set the values in the modal form
            document.getElementById('roomName').value = roomName;
            document.getElementById('roomType').value = roomType;
            document.getElementById('totalPrice').value = 0; // Initial price
            document.getElementById('name').value = User_Name;
            document.getElementById('phone').value = User_Phone;
            document.getElementById('email').value = User_Email;

            // Show the modal
            const modal = new bootstrap.Modal(document.getElementById('bookRoomModal'));
            modal.show();
        });
    });

    // Function to calculate the total price
    function calculateTotalPrice() {
        const noOfRooms = parseInt(document.getElementById('noOfRooms').value) || 0;
        
        // Get check-in and check-out dates
        const chkInDate = new Date(document.getElementById('chkInDate').value);
        const chkOutDate = new Date(document.getElementById('chkOutDate').value);

        // Calculate the difference in milliseconds and then in days
        const timeDiff = chkOutDate - chkInDate;
        const noOfDays = Math.ceil(timeDiff / (1000 * 3600 * 24)); // Convert ms to days

        // Calculate the total price
        const totalPrice = noOfRooms * noOfDays * roomPrice;
        document.getElementById('totalPrice').value = totalPrice >= 0 ? totalPrice : 0; // Update total price field
    }

    // Event listener for number of rooms input
    document.getElementById('noOfRooms').addEventListener('input', calculateTotalPrice);

    // Event listeners for check-in and check-out date changes
    document.getElementById('chkInDate').addEventListener('change', calculateTotalPrice);
    document.getElementById('chkOutDate').addEventListener('change', calculateTotalPrice);

    window.onload = function () {
        const urlParams = new URLSearchParams(window.location.search);
        const status = urlParams.get('status');
        if (status === 'success') {
            const toast = new bootstrap.Toast(document.getElementById('successToast'));
            toast.show();
            setTimeout(function () {
                window.history.replaceState({}, document.title, window.location.pathname);
            }, 3000);
        } else if (status === 'error') {
            const toast = new bootstrap.Toast(document.getElementById('errorToast'));
            toast.show();
            setTimeout(function () {
                window.history.replaceState({}, document.title, window.location.pathname);
            }, 3000);
        }
    };

    document.getElementById("bookingForm").addEventListener("submit", function () {
        let disabledFields = this.querySelectorAll("[disabled]");
        
        // Enable all disabled fields
        disabledFields.forEach(function(field) {
            field.disabled = false;
        });
    });
});

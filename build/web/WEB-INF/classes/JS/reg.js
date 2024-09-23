document.querySelector('form').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent actual form submission

    // Trigger the toast
    var toastLiveExample = document.getElementById('liveToast');
    var toast = new bootstrap.Toast(toastLiveExample);
    toast.show();
});
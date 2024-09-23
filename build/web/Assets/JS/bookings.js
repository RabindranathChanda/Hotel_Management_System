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
    } else if (status === 'delSuccess') {
        const toast = new bootstrap.Toast(document.getElementById('delSuccess'));
        toast.show();
        setTimeout(function () {
            window.history.replaceState({}, document.title, window.location.pathname);
        }, 3000);
    }    
};
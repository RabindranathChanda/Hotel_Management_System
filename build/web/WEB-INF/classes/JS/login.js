const passwordInput = document.getElementById('pass');
const togglePassword = document.getElementById('togglepass');

// Single-click toggle event
togglePassword.addEventListener('click', function () {
  // Toggle the type attribute between password and text
  const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
  passwordInput.setAttribute('type', type);

  // Change the icon accordingly
  if(type === 'text'){
    togglePassword.classList.remove('fa-eye-slash');
    togglePassword.classList.add('fa-eye');
  } else {
    togglePassword.classList.remove('fa-eye');
    togglePassword.classList.add('fa-eye-slash');
  }
});

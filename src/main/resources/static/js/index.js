const password = document.getElementById('password');
const checked = document.getElementById('show');
function togglePasswordVisibility() {
    if (checked.checked) {
        password.type = 'text';
    } else {
        password.type = 'password';
    }
}
checked.addEventListener('click',()=>{
    togglePasswordVisibility()
}
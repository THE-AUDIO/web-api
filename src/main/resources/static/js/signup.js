const pass = document.getElementById('password');
const checked = document.getElementById('show');
const btnSubmit = document.querySelector('.btn-c');
const form = document.querySelector('form')
function togglePasswordVisibility() {
    if (checked.checked) {
        pass.type = 'text';
    } else {
        pass.type = 'password';
    }
}
checked.addEventListener('click',()=>{
    togglePasswordVisibility()
});
 function login(){
const  email = document.getElementById('email').value;
const username = document.getElementById('username').value;
const password = pass.value;
    const data = {
        username,
        email,
        password
    }
    console.log(data);
    const apiUrl = 'http://localhost:9000/req/signup';
    fetch(apiUrl,{
        method: 'POST',
        headers: {
            'content-type': 'application/json',
        },
        body: JSON.stringify(data)

    })
    .then(response => response.json())
    .then(data => {
        console.log(data)
    })

}
btnSubmit.addEventListener('click',(e)=>{
    e.preventDefault()
    login()
})
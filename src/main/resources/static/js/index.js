const pass = document.getElementById('password');
const checked = document.getElementById('show');
const btnSubmit = document.querySelector(".btn-c")
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
//function login(){
//const  email = document.getElementById('email').value;
//const password = pass.value;
//    const data = {
//        email,
//        password
//    }
//   console.log(data)
//   const apiUrl = 'http://localhost:9000/login';
//   fetch(apiUrl,{
//       method: 'POST',
//       headers: {
//           'content-type': 'application/json',
//       },
//       body: JSON.stringify(data)
//
//   })
//   .then(response => response.json())
//   .then(response => console.log(response))
//}
//
//btnSubmit.addEventListener('click',(e)=>{
//    e.preventDefault()
//    login()
//})
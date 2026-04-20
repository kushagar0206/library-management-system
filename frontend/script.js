let btn = document.querySelector("button");
btn.addEventListener("click", function () {
  checker();
});

function checker() {
  let email = document.querySelector("#email").value;
  let password = document.querySelector("#password").value;

  if (email === "admin@2026" && password === "admin4124") {
    window.location.href = "main.html";
  } else {
    let add = document.querySelector(".form-div");
    let error = document.createElement("p");
    error.innerText = "Invalid email or password";
    add.insertAdjacentElement("beforeend", error);
  }
}

import "./styles.scss";
import * as bootstrap from "bootstrap";
import { userCards } from './src/js/userCards'
import { postUser } from "./src/js/postUser";
import { getUsers } from "./src/js/getUsers";
import { validateFormInput } from "./src/js/validateFormInput";
import { appendAlert } from "./src/js/errorMessage";
import { userDetails } from "./src/js/userDetails";

const inputForm = document.forms["create-account-form"];

const showRegisterUsers = async() => {
    userCards( await getUsers());
}
showRegisterUsers();

inputForm.addEventListener("submit", async (e) => {
  e.preventDefault();
  const newUser = userDetails(inputForm);

  let validateInput = validateFormInput(newUser);
  if (validateInput.isValid) {
    await postUser(newUser);
    await showRegisterUsers();
  } else {
    appendAlert(validateInput.alert, "warning" );
  }
});



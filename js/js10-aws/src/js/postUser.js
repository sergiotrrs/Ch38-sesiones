
export const postUser = async ( newUser ) => {
    const url = "http://3.101.68.25:8080/api/v1/users";
    
    const options = {
        method: "POST", // POST, PUT, DELETE, GET
        headers: { "Content-Type":"application/json"},
        body:  JSON.stringify( newUser )
    }

    const response = await fetch( url, options  );
    console.log( response )
    if (response.status === 201){
        const userCreated = await response.json();
        console.log( userCreated)
        alert("Usuario creado con éxito el " + userCreated.createdAt);
        localStorage.setItem("userData", JSON.stringify( newUser ) ); 

    }
} 







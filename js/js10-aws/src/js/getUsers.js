
export const getUsers = async() => {
    const url = "http://3.101.68.25:8080/api/v1/users";
    
    try {
        const response = await fetch(url);
        const users = await response.json();        
        return users;
        
    } catch (error) {
        console.error( error );
    }

}
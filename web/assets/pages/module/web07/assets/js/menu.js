 function insertPrincipalMenu(){
    const menuRef = document.getElementById("menu");

    const pagesArray = ["about", "products", "contact"];

    menuRef.innerHTML = ` 
    <nav>
      <ul>
        <li> <a href="/index.html">Home</a>   </li>
        <li> <a href="/assets/pages/about.html">About Us</a></li>
        <li> <a href="/assets/pages/products.html">Products</a></li>
     </ul>
    </nav>
    `;
 }

 insertPrincipalMenu();
function operation(){
    var nameMenu = document.getElementById('nameMenu').value;
    if (nameMenu === "") {
        alert('MUST GIVE AN ID');
        return false;        
    } else{        
        document.getElementById('form').action = "./U_18.php";        
        return true;
    }
}
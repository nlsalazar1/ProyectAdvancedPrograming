function operation(){
    var nameClient = document.getElementById('nameClient').value;
    if (nameClient === "") {
        alert('MUST GIVE AN ID');
        return false;        
    } else{        
        document.getElementById('form').action = "./U_19.php";        
        return true;
    }
}
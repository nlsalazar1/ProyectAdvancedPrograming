function operation(){
    var name = document.getElementById('nameUser').value;
    if (nameUser === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_16.php";        
        return true;
    }
}
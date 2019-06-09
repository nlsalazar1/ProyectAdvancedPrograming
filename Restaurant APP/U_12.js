
function operation(){
    var name = document.getElementById('name').value;
    var lastname = document.getElementById('lastname').value;
    if (name === "" || lastname === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_12.php";        
        return true;
    }
}
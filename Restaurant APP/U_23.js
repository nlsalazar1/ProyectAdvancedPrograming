
function operation(){
    var name = document.getElementById('name').value;
    if (name === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_23.php";        
        return true;
    }
}
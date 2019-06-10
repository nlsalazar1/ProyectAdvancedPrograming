
function operation(){
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    if (name === "" || id === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./U_22.php";        
        return true;
    }
}
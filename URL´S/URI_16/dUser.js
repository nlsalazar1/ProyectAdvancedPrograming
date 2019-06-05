
function deleteUser(){
    var name = document.getElementById('name').value;
    if (name === "") {
        alert('MUST GIVE AN ID');
        return false;
    } else{        
        document.getElementById('form').action = "./dUser.php";        
        return true;
    }
}
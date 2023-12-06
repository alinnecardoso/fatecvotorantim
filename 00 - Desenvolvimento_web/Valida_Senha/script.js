function fazerCadastro(){
    let resultado = validarSenha()
    if (resultado == false){
        alert(`Senha é Inválida! Verifique se inclui:
8 caracteres
1 letra maiúscula
1 letra minúscula
1 número
1 caracter especial`)
    }
    if (resultado == true){
        alert("Senha válida")
    }
    
    
    let nome = document.querySelector("#inputnome").value;
    
    let endereco = document.querySelector("#inputendereco").value;

    let email = document.querySelector("#inputemail").value;

    let telefone = document.querySelector("#inputtelefone").value;

}
function validarSenha() {
    var senha = document.querySelector("#inputsenha").value;
    var confirmar = document.querySelector("#inputconfirmar").value;

    if (senha !== confirmar) {
        alert('As senhas não são iguais!');
        return false;
    } else {
        // alert('As senhas são iguais!');
    
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length < 8) {
            // alert('A senha deve ter pelo menos 8 caracteres!');
            return false;
        }

        // Verifica se a senha inclui pelo menos uma letra maiúscula
        if (!/[A-Z]/.test(senha)) {
            // alert('A senha deve incluir pelo menos uma letra maiúscula!');
            return false;
        }

        // Verifica se a senha inclui pelo menos uma letra minúscula
        if (!/[a-z]/.test(senha)) {
            // alert('A senha deve incluir pelo menos uma letra minúscula!');
            return false;
        }

        // Verifica se a senha inclui pelo menos um número
        if (!/[0-9]/.test(senha)) {
            // alert('A senha deve incluir pelo menos um número!');
            return false;
        }

        // Verifica se a senha inclui pelo menos um caractere especial
        if (!/[!@#$%^&*]/.test(senha)) {
            // alert('A senha deve incluir pelo menos um caractere especial!');
            return false;
        }
    
        // alert('A senha é válida!');
        return true;
    }
}


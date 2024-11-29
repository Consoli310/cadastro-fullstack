function submitFormAndRedirect(event) {
        event.preventDefault(); // Impede o envio tradicional do formulário

        // Cria um objeto FormData com os dados do formulário
        const formData = new FormData(document.getElementById("myForm"));

        // Envia os dados para o backend
        fetch('/clientes', {
            method: 'POST',
            body: formData
        })
        .then(response => {
            if (response.ok) {
                // Se o envio for bem-sucedido, redireciona para a página de sucesso
                window.location.href = '/sucess';
            } else {
                // Tratar erro
                alert('Erro ao criar o usuário');
            }
        })
        .catch(error => {
            console.error('Erro:', error);
            alert('Erro ao enviar o formulário');
        });
    }
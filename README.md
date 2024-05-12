1. Elabore uma classe ContaBancaria, com os seguintes membros:
• atributo String cliente
• atributo int num_conta
• atributo float saldo
• método sacar (o saldo não pode ficar negativo)
• método depositar
Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupança e
ContaEspecial, com as seguintes caracterís�cas a mais:
• Classe ContaPoupança:
o atributo int dia de rendimento
o método calcularNovoSaldo, recebe a taxa de rendimento da poupança e
atualiza o saldo.
• Classe ContaEspecial
o atributo float limite
o redefinição do método sacar, permitindo saldo negativo até o valor do limite.
Após a implementação das classes acima, você deverá implementar uma Ac�vity, que deverá
implementar, salientando que deve-se haver Radio Butons em um Radio Group para a
seleção do �po de Conta:
• Incluir dados relativos a(s) conta(s) de um cliente de Conta Poupança e Conta
Especial;
• Sacar um determinado valor da(s) sua(s) conta(s);
• Sacar um valor superior ao saldo;
• Sacar um valor dentro do limite da conta especial e acima do limite;
• Depositar um determinado valor na(s) sua(s) conta(s);
• Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que
possuem conta poupança;
• Mostrar os dados da(s) conta(s) de um cliente;

import java.util.Scanner

fun main() {
val scanner = Scanner(System.`in`)                                                // variavel 'scanner' criada para receber dados do usuario

print("Olá, digite o seu nome: ")                                                 // pede para o usuario digitar seu nome
val nome = scanner.next()                                                         // guarda o valor recebido na variavel 'nome'

println("Olá $nome, em seguida insira 2 numeros para fazer uma soma")


print("Insira o numero 1: ")                                                      // pede para o usuario entrar com um numero
var a = scanner.nextInt()                                                         // guarda o valor recebido

print("Insira o numero 2: ")                                                      // pede para o usuario entrar com um numero
var b = scanner.nextInt()                                                         // guarda o valor recebido
var soma = a + b                                                                  // guarda a soma de 'a' e 'b' em uma variavel

println("O resultado da soma é: $soma")                                           // imprime o resultado da soma de 'a' e 'b'


}

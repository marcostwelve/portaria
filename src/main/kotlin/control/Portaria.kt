package control

import business.ConvidadoBusiness
import entiny.Convidado

class Portaria {

    private val convidadoBusinees = ConvidadoBusiness()
    init {
        println("Portaria inicializada.")
        println(controle())
    }

    private fun controle(): String {

        //chamando a instância do controle com a função readInt
       val idade = Console.readInt("Qual é a sua idade: ")
       val convidado = Convidado(idade = idade)
        if(!convidadoBusinees.maiorDeidade(convidado.idade)) {
           return  "Negado. Menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite: ")
        if(!convidadoBusinees.validaTipo(convidado.tipo)) {
            return "Negado. Tipo inválido"
        }

        convidado.codigo = Console.readString("Qual é o código do convite: ")

        if(!convidadoBusinees.convidadoValido(convidado)) {
            return "Negado. Tipo inválido"
        }

        return "Welcome! :)"
    }

}
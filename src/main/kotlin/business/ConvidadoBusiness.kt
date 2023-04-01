package business

import entiny.Convidado

class ConvidadoBusiness {

    fun validaTipo(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")


    fun maiorDeidade(idade: Int) = idade >= 18
    fun convidadoValido(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }

}
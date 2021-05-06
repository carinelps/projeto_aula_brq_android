package br.com.brq.projetoaulabrqandroid.oo_pessoa

import br.com.brq.projetoaulabrqandroid.oo_animal.Animal
import br.com.brq.projetoaulabrqandroid.oo_cor.Cor

open class Pessoa (
    open val sexo: String,
    open val animal: Animal,
    open val cor: Cor
){

}

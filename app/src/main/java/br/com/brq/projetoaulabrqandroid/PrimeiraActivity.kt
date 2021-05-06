package br.com.brq.projetoaulabrqandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brq.projetoaulabrqandroid.oo_animal.*
import br.com.brq.projetoaulabrqandroid.oo_cor.Amarelo
import br.com.brq.projetoaulabrqandroid.oo_cor.Azul
import br.com.brq.projetoaulabrqandroid.oo_cor.Cor
import br.com.brq.projetoaulabrqandroid.oo_pessoa.Homem
import br.com.brq.projetoaulabrqandroid.oo_pessoa.Mulher
import br.com.brq.projetoaulabrqandroid.oo_pessoa.Pessoa

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)

        val corAmarelo = Amarelo(nome = "Amarelo Claro")
        val corAzul = Azul(nome = "Azul Marinho")

        val gato = Gato("Meu Gato", "Não sei", "Curto")
        val cachorro = Cachorro(nome = "Meu cachorro", raca = "Beagle", tipoDePelo = "Curto")
        val cavalo = Cavalo("Meu cavalo")
        val passarinho = Passarinho("Pardal")

        val homem = Homem(animal = passarinho, cor = corAzul)
        val mulher = Mulher(animal = cavalo, cor = corAmarelo)

        Homem(cachorro, corAzul).apply {
            meDigaSeuSexo(this)
            meDigaSeuAnimalDeEstimacao(this)
        }

        Mulher(passarinho, corAmarelo).apply {
            meDigaSeuSexo(this)
            meDigaSeuAnimalDeEstimacao(this)
        }


        pintar(corAmarelo)
        pintar(corAzul)
        levarAoPetShop(gato)
        levarAoPetShop(cachorro)
        meDigaSeuSexo(homem)
        meDigaSeuSexo(mulher)

    }
        fun pintar(cor: Cor){
            println("Pintando uma parede com a cor: ${cor.nome}")
        }

        fun levarAoPetShop(animal: Animal){
            println("Levando o/a: ${animal.nome}")
        }

        fun meDigaSeuSexo(pessoa: Pessoa){
            println("Seu sexo é: ${pessoa.sexo}")
        }

        fun meDigaSeuAnimalDeEstimacao(pessoa: Pessoa){
            println("Seu animal de estimação é: ${pessoa.animal}")
        }
}


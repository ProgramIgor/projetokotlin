fun calculaBonus(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador

    val bonus: Float
    if (cargo == "Coordenador") {
        bonus = salario * 1.2f
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 1.5f
    } else {
        bonus = salario * 2
    }

    return bonus
}


fun maiorDeIdade(idade: Int): Boolean {
    return idade >= 18
    println()
}


fun main() {
    println(calculaBonus("Cordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Senior", 1000f))

}




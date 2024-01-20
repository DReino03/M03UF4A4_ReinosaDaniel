package M03_UF4_A4_persones

fun main(args: Array<String>) {
    val johndoe: Persona = Persona()
    johndoe.neixer()
    johndoe.parlar()
    johndoe.morir()
    val manuel: Persona = Persona("Manuel", "Ruiz González")
    manuel.neixer()
    manuel.parlar()
    manuel.morir()
    val eva: Persona = Persona("Eva", "Castillo Real", 31)
    eva.neixer()
    eva.parlar()
    eva.morir()
    val ana: Persona = Persona("Ana", "Díaz Marco", 25, 1.65, 53)
    ana.neixer()
    ana.parlar()
    ana.morir()
}


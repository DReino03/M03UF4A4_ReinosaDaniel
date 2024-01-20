package M03_UF4_A4_persones

class Persona(var nom: String,var cognoms: String) {
    //Estructura, coneguda com a propietats o atributs
    var edat: Int = 0
    var alcada: Double = 0.0
    var pes: Int = 0

    init {
        edat = 18
        alcada = 170.0
        pes = 71
    }

    constructor(): this("Anònim","Anònimez")

    constructor(nom:String, cognom:String, edat:Int): this(nom, cognom) {
        this.edat = edat
    }

    constructor(nom:String, cognom:String, edat:Int, alcada: Double, pes: Int): this(nom, cognom) {
        this.edat = edat
        this.alcada = alcada
        this.pes = pes
    }



    //Comportament, també conegut com mètodes
    fun caminar() {
        println(quiSocJo() + "Estic caminant")
    }

    fun parlar() {
        println(quiSocJo() + "Estic parlant")
    }

    fun neixer() {
        println(quiSocJo() + "Tot just ara he nascut!!!")
    }

    fun morir() {
        println(quiSocJo() + "Ens veiem a l'infern!")
    }

    fun presentacio(){
        println("Em dic $nom $cognoms, tinc $edat anys, medeixo $alcada m i peso $pes quilos.")
    }
    private fun quiSocJo() : String {
        return nom + cognoms + ":: "
    }
}
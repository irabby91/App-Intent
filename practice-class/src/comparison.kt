fun main()
{
    print("enter name:")
    val name=readln().toInt()
    print("enter salary:")
    val salary=readln().toDouble()

    print("enter your totalsales:")
    val totalsales=readln().toInt()

    val bonaus=totalsales*0.15

    val total=salary+bonaus
    println("total")

}
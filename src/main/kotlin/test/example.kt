package demo
public var a:Int  = 1
public const val c: Int  =  2
public fun  testLoop ():Unit{
    val a = 0
    var b = 5
    var arr = mutableListOf(1,2,3,4,5)
    for (i in arr){
        print(i)
    }
    for (i in 0..5 step 1){
        print(i)
    }
    while (a<b){
        break
    }
}
public fun  testJudge ():Unit{
    a=1
    val b = 2
    var s = "hello "+a+" world"
    if (a==1) {
    }
    else {
    }
    when (a) {
        1 ->
        {}
        else ->
        {}
    }
}
public fun  testLambda ( fn:(Int)->Unit ):Unit{
}
public class pack:software{
    public val name:String = "k"
    public var age:Int = 2
    public  fun  stop ():Unit{
    }
    public override val title:String

    public override var description:String

    public override fun  run ():Unit{
    }
    public constructor(){title=""
        description=""
    }
}
public interface software{
    val title: String
    var description: String
    fun run():Unit
}
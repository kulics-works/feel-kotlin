package lit

//import Library.*;

public var a:Int  = 1
public const val c: Int  =  2
public fun  test ():Unit{
    a = 1
    var b = 2
    var s = "hello ${ a }  world "
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
    var arr = mutableListOf(1,2,3,4,5)
    for (i in arr){
        print(i)
    }
    for (i in 0 until 5 step 1){
        print(i)
    }
    while (a<b){
        break
    }
}
public class pack:software{
    public var name:String = "lite"
    public var age:String = "2"

    public constructor(){}

    public fun  stop ():Unit{
    }

    public override var title:String
        get(){return this.name  }
        set(v){ this.name =v}

    public override fun  run ():Unit{
    }
}
public interface software{
    var title:String
    fun run():Unit
}
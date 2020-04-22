demo . {}

a! : 1
c : 2

test : (->) {
    a = 1
    b = 2
    s = "hello " + a +  " world"
    ? a == 1 {
    } _ {
    }
    ? a : 1 {
    } _ {
    }
    arr : {1;2;3;4;5}
    @ i : arr {
        print(i)
    }
    @ i : 0~5 {
        print(i)
    }
    @ a < b {
        ~@
    }
}

pack : software \/ $ me {
    name : "k"
    age : "2"
    stop : (->){
    }
    title! str
    run : (->) {}
} \/ (->$) {

}

software : $$ {
    # title! str
    run (->)
}
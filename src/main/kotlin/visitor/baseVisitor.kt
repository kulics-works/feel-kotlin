class LiteLangVisitor() : LiteParserBaseVisitor<any>() {
    var selfID = ""
    var superID = ""
    var setID = ""

    var AllIDSet = mutableSetOf<str>()
    var CurrentIDSet = mutableListOf<set<str>>()

    fun has_id(id: str): bool {
        return AllIDSet.contains(id) || CurrentIDSet.peek().contains(id)
    }

    fun add_id(id: str) {
        CurrentIDSet.peek().add(id)
    }

    fun add_current_set() {
        for (k in CurrentIDSet.peek()) {
            AllIDSet.add(k)
        }
        CurrentIDSet.push(mutableSetOf<str>())
    }

    fun delete_current_set() {
        // printJSON(me.AllIDSet)
        AllIDSet.removeAll(CurrentIDSet.peek())
        // printJSON(me.AllIDSet)
        CurrentIDSet.pop()
    }
}

class Result() {
    var data: any? = null
    var text = ""
    var permission = ""
    var isVirtual = false
    var isDefine = false
}

fun <T> list<T>.peek(): T {
    return this[this.size - 1]
}

fun <T> list<T>.push(new: T) {
    this.add(new)
}

fun <T> list<T>.pop() {
    this.removeAt(this.size - 1)
}
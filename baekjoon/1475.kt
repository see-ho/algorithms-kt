fun main() {
    val room = readln()
    val arr = IntArray(9) { 0 }

    for (ch in room) {
        if (ch == '9') arr[6]++
        else arr[ch.digitToInt()]++
    }

    arr[6] = (arr[6] + 1) / 2

    print(arr.max())
}

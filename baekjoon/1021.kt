import java.util.ArrayDeque

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val targets = readln().split(" ").map { it.toInt() }
    val rotationQueue = ArrayDeque((1..n).toList())
    var totalRotate = 0
    var targetIndex = 0

    fun rotateLeft(){
        rotationQueue.addLast(rotationQueue.pollFirst())
        totalRotate++
    }

    fun rotateRight(){
        rotationQueue.addFirst(rotationQueue.pollLast())
        totalRotate++
    }

    while (targetIndex < targets.size) {
        if (rotationQueue.first() == targets[targetIndex]) {
            rotationQueue.remove()
            targetIndex++
        } else{
            if(rotationQueue.indexOf(targets[targetIndex]) > rotationQueue.size/2)
                rotateRight()
            else
                rotateLeft()
        }
    }
    println(totalRotate)
}

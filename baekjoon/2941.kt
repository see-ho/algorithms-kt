fun main(){
    var str = readln()
    str = str.replace("dz=","z=")
    str = str.replace("=","")
    str = str.replace("-","")
    str = str.replace("lj","l")
    str = str.replace("nj","l")
    println(str.length)
}
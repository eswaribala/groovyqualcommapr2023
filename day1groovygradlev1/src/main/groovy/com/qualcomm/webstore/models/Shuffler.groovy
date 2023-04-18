package com.qualcomm.webstore.models

@Category(List)
class Shuffler {
  //  String info
    def shuffle() {
        def result = new ArrayList(this)
    //    info="Hi"
        Collections.shuffle(result)
        result
    }
    def test() {
        def result = new ArrayList(this)
        //    info="Hi"
       // Collections.shuffle(result)
        result
    }
}
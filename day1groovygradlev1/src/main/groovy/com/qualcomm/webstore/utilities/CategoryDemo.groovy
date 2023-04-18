package com.qualcomm.webstore.utilities

import com.qualcomm.webstore.models.Sentence
import com.qualcomm.webstore.models.Shuffler

Sentence.mixin Shuffler
def words = ["The", "quick", "brown", "fox"]
println new Sentence(words).shuffle()

println new Sentence(words).test()



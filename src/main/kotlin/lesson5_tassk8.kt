package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import org.jsoup.nodes.Element

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    println(doc.title())
    val quotesTextdoc: Elements = doc.select(".sc-2aegk7-2")
    println(quotesTextdoc)
    for (quotes: Element in quotesTextdoc) {
        println("Цитата: $quotes")
    }
}
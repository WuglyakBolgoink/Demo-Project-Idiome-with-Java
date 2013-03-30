java_idiome
===========

hashCode und equals

Laden Sie die vordefinierten
Klassen Rectangle und
Block herunter.
Rectangle repräsentiert ein unveränderliches Rechteck,
Block einen Quader mit rechteckiger Grundfläche.
Alle Kantenlängen sind ganzzahlig,
um die Probleme von Floatingpoint-Arithmetik auszuschließen.


Block leitet Rectangle ab und erbt davon die Eigenschaften der Grundfläche.
Ob Vererbung hier überhaupt das passende Sprachmittel ist,
sei dahin gestellt.


Ergänzen Sie beide Klassen um die Methoden equals und hashCode.
Ändern Sie keinen bestehenden Code, sondern fügen Sie Ihre Methoden hinzu.

Drehung

Implementieren Sie in Rectangle eine Methode flip, die das Rechteck um 90⁰ dreht.
Im gedrehten Rechteck sind Breite und Höhe vertauscht.
Nach einer geraden Anzahl von Drehungen ist ein Rechteck gleich zum Original.


Implementieren Sie auch in Block diese Methode.
Der Block dreht sich dabei auf der Grundfläche.
Die Tiefe ist nicht beteiligt und bleibt unverändert.

Ordnungsrelation

Bei Typen mit Ordnungsrelation kommen zu equals und hashCode
noch die Methoden compare beziehungsweise compareTo dazu.


Rectangle und Block haben keine natürliche Ordnung,
daher spielen das Interface Comparable und die Methode compareTo keine Rolle.


Schreiben Sie für Rectangle und Block je eine Comparator-Klasse,
RectangleWHComparator und BlockWHDComparator.
RectangleWHComparator sortiert Rechtecke zuerst nach der Breite (schmale Rechecke nach vorne, breite nach hinten),
bei gleicher Breite nach der Höhe.
BlockWHDComparator sortiert Quader zuerst nach Breite, dann nach Höhe und zuletzt nach Tiefe.


Testen Sie die Ordnungsrelationen mit passenden Collections (TreeSet)
und Collectionalgorithmen (Collections.sort, min, max).

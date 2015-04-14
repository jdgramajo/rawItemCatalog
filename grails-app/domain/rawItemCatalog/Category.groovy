package rawItemCatalog

class Category {

    static hasMany = [subCategory: Category]
    static belongsTo = [parentCategory: Category]

    String name
    String comments
    boolean subcategorizable
    Category subcategoryOf

    static constraints = {
    }
}

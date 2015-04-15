package rawItemCatalog

class Category {

    static hasMany = [subCategories: Category]
    static belongsTo = [parentCategory: Category]

    String name
    String comments
    boolean subcategorizable

    static constraints = {
    }
}

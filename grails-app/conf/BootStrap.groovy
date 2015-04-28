import grails.util.Environment

import rawItemCatalog.*

class BootStrap {

    def init = { servletContext ->
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                // Populate with dev data
                // MeasureUnit
                new MeasureUnit(name: "Grams", abreviation: "grs", comments: "---").save()      // 1
                new MeasureUnit(name: "Pounds", abreviation: "lbs", comments: "---").save()     // 2
                new MeasureUnit(name: "Litter", abreviation: "L", comments: "---").save()       // 3
                new MeasureUnit(name: "Gallon", abreviation: "Gal", comments: "---").save()     // 4
                new MeasureUnit(name: "6 pack", abreviation: "6pck", comments: "---").save()    // 5
                new MeasureUnit(name: "Unit", abreviation: "u", comments: "---").save()         // 6
                new MeasureUnit(name: "Ounces", abreviation: "oz", comments: "---").save()      // 7
                new MeasureUnit(name: "Dozen", abreviation: "dzn", comments: "---").save()      // 8
                new MeasureUnit(name: "Bottle", abreviation: "btl", comments: "---").save()     // 9
                // Category
                // Parent categories
                new Category(name: "Liquids", comments: "All liquids.").save()      // 1
                new Category(name: "Solids", comments: "All solids.").save()        // 2
                new Category(name: "Gases", comments: "All gases.").save()          // 3
                new Category(name: "Edible", comments: "All things edible.").save() // 4
                new Category(name: "Non Edible", comments: "All things not for human consumption.").save()  // 5
                // Categories with parents
                new Category(name: "Beverages", comments: "All drinkable liquids", parentCategory: 1).save()    // 6
                new Category(name: "Housekeeping", comments: "Used in housekeeping.", parentCategory: 2).save() // 7
                new Category(name: "Utensils", comments: "For any use.", parentCategory: 2).save()              // 8
                new Category(name: "Crystalware", comments: "Glass or crystal recipients.", parentCategory: 2).save() // 9
                new Category(name: "Kitchen", comments: "Used or generally found in the kitchen.", parentCategory: 2).save() // 10
                new Category(name: "Serving", comments: "Used for serving.", parentCategory: 2).save() // 11
                new Category(name: "Ingredients", comments: "Cooking ingredients.", parentCategory: 10).save() // 12
                break
            default:
                break
        }
    }
    def destroy = {
    }
}

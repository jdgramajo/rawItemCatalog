import grails.util.Environment
import rawItemCatalog.MeasureUnit

class BootStrap {

    def init = { servletContext ->
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                //populate with dev data
                new MeasureUnit(name: "Grams", abreviation: "grs", comments: "---").save()
                new MeasureUnit(name: "Pounds", abreviation: "lbs", comments: "---").save()
                new MeasureUnit(name: "Litter", abreviation: "L", comments: "---").save()
                new MeasureUnit(name: "Gallon", abreviation: "Gal", comments: "---").save()
                new MeasureUnit(name: "6 pack", abreviation: "6pck", comments: "---").save()
                new MeasureUnit(name: "Unit", abreviation: "u", comments: "---").save()
                new MeasureUnit(name: "Ounces", abreviation: "oz", comments: "---").save()
                new MeasureUnit(name: "Dozen", abreviation: "dzn", comments: "---").save()
                new MeasureUnit(name: "Bottle", abreviation: "btl", comments: "---").save()
                break
            default:
                break
        }
    }
    def destroy = {
    }
}

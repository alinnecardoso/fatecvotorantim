module.exports = class TemperatureModel {
    constructor() { }
    
    Converter(type, temperature) {
        let newTemp
        switch (type.toUpperCase()) {
          case "C":
            newTemp = (9 * temperature / 5) + 32
            break;
      
          case "F":
            newTemp = 5 * (temperature - 32) / 9
            break;
      
          default:
            newTemp = 0;      
            break;
        }
        return newTemp
      }
}


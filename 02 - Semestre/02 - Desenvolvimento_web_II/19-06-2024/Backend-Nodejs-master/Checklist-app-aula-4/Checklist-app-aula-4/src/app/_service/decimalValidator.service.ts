import { AbstractControl, ValidationErrors, ValidatorFn } from '@angular/forms';

export function decimalValidator(): ValidatorFn {
  return (control: AbstractControl): ValidationErrors | null => {
    if (!control.value) {
        return null; // Se o valor for vazio ou null, consideramos válido
      }

   
    const isValid = /^\d+.\d{1,4}$/.test(control.value);
    

    return isValid ? null : { invalidDecimal: { value: control.value } };
  };
}
import { NgModule } from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MatPseudoCheckbox } from "@angular/material/core";
import { MatIconModule } from "@angular/material/icon";
import { MatListModule } from "@angular/material/list";
import { MatSidenav, MatSidenavModule } from "@angular/material/sidenav";
import { MatToolbar, MatToolbarModule } from "@angular/material/toolbar";

@NgModule({
    imports: [MatSidenavModule, MatListModule, MatPseudoCheckbox, MatIconModule, MatToolbarModule, MatButtonModule, MatToolbarModule],
    exports:[MatSidenavModule, MatListModule, MatPseudoCheckbox, MatIconModule, MatToolbarModule, MatButtonModule, MatToolbarModule]
})

export class MaterialModule{

}
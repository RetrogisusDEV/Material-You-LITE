# Material You Lite
__Plis Help to Translate to english__

__Importante: los archivos estan siendo agregados__

__need help to build: <a href="https://github.com/RetrogisusDEV/Material-You-LITE/commit/4fce920c24819b629ee893cd78e3041da8cb4122/checks?check_suite_id=15166616835">Android CI</a>__

Material You Lite es una plantilla `OpenSource` para introducir rapida y comodamente Material Desing 3 en cualquier app.

En android Studio o en Reverse(Smali/Java).

Todas las colaboraciones son bienvenidas para mejorar esta plantilla de diseño

__El checkbox de cambiar tema no funciona completamente xd__

|![Dark](/image/dark.png)|![Light](/image/light.png)|
|---|---|

## Actualmente diseñados

- ✅ App Theme
  - Dark
  - Light

- Layouts

  - ✅ Linear Layout
  - ❌ Relative Layout
  - ❌ Frame Layout
  - ❌ ScrollView and Horizontal ScrollView

- Widget

  - ✅ TextView
  - ❌ ImageView
  - ❌ View
  - ✅ Button
  - ❌ CheckBox
  - ✅ SeekBar
  - ❌ RadioButton
  - ❌ CardView

- Sistema

  - ✅ Dialog 
  - ❌ notificaciones

### Como usarlo?

Copiar (y/o fusionar) la carpeta `app/src/main/res/drawable` en tu carpeta `res/drawable`, ya que esta contiene los archivos `rgd_(name).xml` para los diseños.

Fusionar o Cambiar el archivo `styles` de `res/values/styles.xml` (de tu proyecto), por el de `app/src/main/res/values` para poder usar los diseños ya precreados en tus layout, estos terminan en Compat (no vienen de la libreria appCompat)

y por ultimo fusiona el archivo `colors` de `res/values/styles.xml` (de tu proyecto), por el de `app/src/main/res/values` para que se puedan obtener los colores empleadon (clro que puedes cambiarlos a tu gusto o necesidad)

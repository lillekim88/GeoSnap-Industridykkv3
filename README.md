# GeoSnap-Industridykkv3

[![Android APK Builder (PROOF)](https://github.com/lillekim88/GeoSnap-Industridykkv3/actions/workflows/android-build.yml/badge.svg)](https://github.com/lillekim88/GeoSnap-Industridykkv3/actions/workflows/android-build.yml)

ta bilde så kommer det opp som tekst på bilde hvor du er navnet på gate/vei/bro himmel retning og gps pungt

## GeoSnap Industridykk — Android v0.1.7-PROOF

Denne PROOF-byggen viser tydelig at riktig versjon er installert:
- App-navn: **GeoSnap Industridykk v0.1.7-PROOF**
- HUD-linje øverst: **v0.1.7-PROOF**
- Toast ved oppstart: **GeoSnap v0.1.7-PROOF**

## Bygg i GitHub Actions

### Automatisk bygging
Workflow kjører automatisk ved push til main eller copilot/** branches, eller ved pull requests.

### Manuell bygging
1. Gå til [Actions](https://github.com/lillekim88/GeoSnap-Industridykkv3/actions) → **Android APK Builder (PROOF)** → **Run workflow**
2. Velg `build_type = debug` eller `release`
3. Klikk **Run workflow**

### Godkjenn workflow (første gang)
Hvis det er første gang, må du godkjenne workflow:
1. Gå til [Actions](https://github.com/lillekim88/GeoSnap-Industridykkv3/actions)
2. Klikk på workflow run som venter
3. Klikk **Approve and run**

### Laste ned APK
1. Etter grønt ✔ på workflow run
2. Nederst på kjøringen: **Artifacts**
3. Last ned `GeoSnapIndustridykk-debug-apk` → pakk ut → `app-debug.apk`
4. Installer på telefonen (Filer → Installer ukjente apper)

Når appen starter, skal du se toasten og HUD-linjen med `v0.1.7-PROOF`.

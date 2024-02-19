
SRC_URI:append:rb700-64 = "file://pigeon-led-cm4-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays \
		file://pigeon-tpm-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays \
		file://pigeon-eeprom-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays \
		"

SRC_URI:append:rb350-64 = "file://pigeon-led-cm3-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

DESCRIPTION = "Simple service to resize data patition"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

RDEPENDS:${PN} += "\
	e2fsprogs-resize2fs \
	gptfdisk \
	parted \
	grep \
	"

SRC_URI = " \
	file://resize-data-part.service \
"

SYSTEMD_SERVICE:${PN} = "resize-data-part.service"

do_install () {
	install -d ${D}${systemd_unitdir}/system/
	install -m 0644 ${WORKDIR}/resize-data-part.service ${D}${systemd_unitdir}/system/
}

SUMMARY = "Systemd CAN Interface Configuration"
SECTION = "Network"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://80-can.network"

do_install() {
	install -d ${D}/${systemd_unitdir}/network
	install -m 644 ${WORKDIR}/80-can.network ${D}/${systemd_unitdir}/network
}

FILES:${PN} += "${systemd_unitdir}/network"

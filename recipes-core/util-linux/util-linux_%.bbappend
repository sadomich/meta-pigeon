FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
	file://0001-agetty-resolve-tty-name-even-if-stdin-is-specified.patch \
	"

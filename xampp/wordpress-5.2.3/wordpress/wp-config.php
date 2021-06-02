<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://codex.wordpress.org/Editing_wp-config.php
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'ahedegames' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'f2R.c(0vF+4IWX9T9ZljiuMtt<]u!NChF.&M^M?w8W/j;qZ5/1OYru2u)zPOKDT4' );
define( 'SECURE_AUTH_KEY',  '[YkLuZO,r2=y20+E{rgRLga)v??5=fN!XJjht,+1LUY,!N}RTXx|G8w1d2$jm8z)' );
define( 'LOGGED_IN_KEY',    '1oD2|) M3# ?n.Xcm^kr=_Lb%z)9r*PqQ13zP8:jM;D6j/a]C;NLUd7^c,2UD6@[' );
define( 'NONCE_KEY',        '`ZCg>}q`*H{Ky4G}3Gh*i!&g3#%Mg2q~Z:!}~/^(-t$DV,yl;V(#.MOtnv@dDdO;' );
define( 'AUTH_SALT',        'y1m;Qu;K%?_8mh/Zk?}74)4^dh!MY-:EBHgs>C3X[Al `y:iUkruDR|+@F^){Z {' );
define( 'SECURE_AUTH_SALT', '+k!Phw(w`,!=8iRSWF `Z|3pwvs8bN]iJgC_xB6H+/(}NKbS35?dv9#%v61oEXRl' );
define( 'LOGGED_IN_SALT',   '!o~nX+9FK|$es53 7[UU4Qu)Jx 6-<*[D^lt=(2a]Bc[PwfqOA6<wdKwIKX+^qj@' );
define( 'NONCE_SALT',       ',~3Y2B4apFkFX|sq)lUv(}RD*asvM7@Yy[E)w yf$+3VA@7_Hh88bF**n<EyUXB_' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the Codex.
 *
 * @link https://codex.wordpress.org/Debugging_in_WordPress
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', dirname( __FILE__ ) . '/' );
}

/** Sets up WordPress vars and included files. */
require_once( ABSPATH . 'wp-settings.php' );
